5. Run with Env Variables

Option A: Use .env file inside container:

docker build -t flask-env-test .
docker run -p 5000:5000 flask-env-test


Option B: Override in runtime:

docker run -p 5000:5000 -e APP_NAME=JenkinsTest -e APP_ENV=staging flask-env-test
