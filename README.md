# Artemis-Financial-Security
Developer: Umar Asif 

Artemis Financial is a financial services company that required a security enhancement for their existing applications. Their main concern was the protection of sensitive financial data and ensuring that their software adhered to modern secure development practices. I was responsible for assessing vulnerabilities, implementing cryptographic protections, and securing communications within the application.

Throughout the project, I was able to identify insecure areas, including the lack of HTTPS communication and the absence of secure hashing mechanisms. Addressing these vulnerabilities demonstrated the importance of coding securely, as it protects the company from potential breaches, data leaks, and financial losses. Secure software development strengthens a company's reputation, builds customer trust, and protects sensitive assets.

One of the more challenging aspects was configuring the HTTPS communication, specifically setting up and integrating an SSL certificate within the Spring Boot application. This hands-on experience was valuable for understanding secure server configuration and SSL/TLS protocols in real-world applications.

I increased the application’s security by implementing SHA-256 cryptographic hashing, enabling HTTPS through server configuration, and scanning the code with OWASP Dependency-Check to ensure no vulnerable libraries were present. In the future, I would continue to use static and dynamic analysis tools such as SonarQube, OWASP ZAP, and Snyk, while also consulting NIST and OWASP guidelines to decide on mitigation strategies.

After refactoring the code, I validated functionality and security by manually testing application endpoints and verifying HTTPS access. I also conducted a secondary vulnerability scan using OWASP Dependency-Check to confirm that no new security risks were introduced.

The tools and practices used, such as SHA-256 hashing, Java key management with keytool, Spring Boot secure server configurations, and static code analysis, will be highly useful for future security-related assignments and professional projects.

For future employers, I can showcase this project as an example of my secure coding practices, vulnerability assessment skills, server configuration abilities, and my understanding of integrating cryptographic techniques into production-ready software. This project demonstrates my commitment to developing secure, reliable, and professional applications.
