# Java WebApp Demo

This repository contains a minimal Java web application used in DevOps courses.
It is designed to be built and deployed by a Tekton pipeline.

## Features

- Servlet at `/` that displays a configurable greeting and a link to view the
  current server time.
- Servlet at `/time` that shows the server's date and time.

## Building Locally

1. Build the WAR file:

   ```bash
   mvn package
   ```

2. Build the container image:

   ```bash
   docker build -t java-webapp:latest .
   ```

The Tekton pipeline in the separate repository automates these steps and pushes
images to your registry.
