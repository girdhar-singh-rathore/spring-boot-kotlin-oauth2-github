## Spring Boot OAuth2 with GitHub

1. create an app OAuth app on GitHub

references: https://docs.github.com/en/apps/oauth-apps/building-oauth-apps/creating-an-oauth-app

2. update the application.yml with the client id and client secret

```yaml
client-id: xxxx
client-secret: xxxx
```

3. login to the app at http://localhost:8080/ via GitHub