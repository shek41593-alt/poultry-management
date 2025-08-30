# Poultry Manager — Starter

## Quick run

1. Copy `.env.example` to `.env` and edit.
2. Build backend jar:
   ```bash
   cd backend
   mvn clean package -DskipTests
   cd ../infra
   ```
3. Start project:
   ```bash
   docker compose up --build
   ```

Open http://localhost to see frontend.
