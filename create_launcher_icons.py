#!/usr/bin/env python3
"""
Create valid Android launcher icon PNG files without external dependencies.
Uses only Python standard library.
"""
import struct
import zlib
import os

def create_simple_png(width, height, r, g, b):
    """Create a simple solid color PNG using only stdlib"""
    # PNG header
    png = b'\x89PNG\r\n\x1a\n'

    # IHDR chunk
    ihdr_data = struct.pack('>IIBBBBB', width, height, 8, 2, 0, 0, 0)
    png += struct.pack('>I', len(ihdr_data))
    png += b'IHDR' + ihdr_data
    png += struct.pack('>I', zlib.crc32(b'IHDR' + ihdr_data) & 0xffffffff)

    # IDAT chunk - image data
    raw = b''
    for y in range(height):
        raw += b'\x00'  # no filter
        raw += bytes([r, g, b] * width)

    compressed = zlib.compress(raw, 9)
    png += struct.pack('>I', len(compressed))
    png += b'IDAT' + compressed
    png += struct.pack('>I', zlib.crc32(b'IDAT' + compressed) & 0xffffffff)

    # IEND chunk
    png += struct.pack('>I', 0)
    png += b'IEND'
    png += struct.pack('>I', zlib.crc32(b'IEND') & 0xffffffff)

    return png

# Icon sizes for each density
sizes = {
    'mdpi': 48,
    'hdpi': 72,
    'xhdpi': 96,
    'xxhdpi': 144,
    'xxxhdpi': 192
}

# Create directory structure and icons
res_path = 'app/src/main/res'
for density, size in sizes.items():
    dir_path = os.path.join(res_path, f'mipmap-{density}')
    os.makedirs(dir_path, exist_ok=True)

    # Create orange/yellow icon (like yellow card)
    png_data = create_simple_png(size, size, 255, 193, 7)

    # Write both launcher and round icons
    with open(os.path.join(dir_path, 'ic_launcher.png'), 'wb') as f:
        f.write(png_data)
    with open(os.path.join(dir_path, 'ic_launcher_round.png'), 'wb') as f:
        f.write(png_data)

    print(f"✓ Created {density} icons ({size}x{size}px)")

print("\n✅ All launcher icon PNG files created successfully!")
print("Run: ./gradlew clean assembleRelease")
