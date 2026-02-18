# Security Policy

## Supported Versions

We are committed to maintaining the security of the Ref Cards App. The following versions are currently supported with security updates:

| Version | Supported          |
| ------- | ------------------ |
| 1.0.x   | :white_check_mark: |

## Reporting a Vulnerability

We take security vulnerabilities seriously. If you discover a security issue, please report it responsibly.

### How to Report

**Please do NOT create a public GitHub issue for security vulnerabilities.**

Instead, please report security vulnerabilities by:

1. **Email**: Send details to the repository maintainers
2. **GitHub Security Advisories**: Use the [Security tab](https://github.com/iSee-Red/Ref-Cards-App/security) to privately report vulnerabilities

### What to Include

When reporting a vulnerability, please include:

- Description of the vulnerability
- Steps to reproduce the issue
- Potential impact
- Suggested fix (if any)
- Your contact information

### Response Timeline

- **Acknowledgment**: Within 48 hours
- **Initial Assessment**: Within 5 business days
- **Status Updates**: Every 7 days until resolution
- **Fix Timeline**: Depends on severity
  - Critical: 1-7 days
  - High: 7-30 days
  - Medium: 30-90 days
  - Low: Best effort basis

### What Happens Next

1. We'll acknowledge your report and begin investigation
2. We'll work on a fix and keep you updated on progress
3. We'll notify you when the fix is ready for testing
4. After verification, we'll release the fix
5. We'll publicly disclose the vulnerability (with credit to you, if desired)

## Security Best Practices

### For Users

- Download APKs only from official GitHub releases
- Verify APK signatures before installation
- Keep your app updated to the latest version
- Report suspicious behavior immediately

### For Developers

- Never commit sensitive data (API keys, passwords, keystores)
- Use environment variables for sensitive configuration
- Follow secure coding practices
- Keep dependencies up to date
- Review code for security issues before merging

## Known Security Considerations

### Android Permissions

This app requires minimal permissions:
- No internet access required
- No special permissions needed
- No data collection or transmission

### Data Privacy

- No user data is collected
- No analytics or tracking
- No network communication
- All functionality is local to the device

## Dependencies

We use Dependabot to automatically check for vulnerable dependencies. Security updates are prioritized and applied promptly.

## Security Updates

Security updates will be:
- Released as soon as fixes are verified
- Announced in release notes
- Tagged with appropriate severity levels
- Documented in CHANGELOG.md

## Acknowledgments

We appreciate responsible disclosure of security vulnerabilities. Contributors who report valid security issues will be acknowledged in our security advisories (with their permission).

## Contact

For security-related questions or concerns, please contact the repository maintainers through GitHub.

---

Thank you for helping keep Ref Cards App and its users safe!
