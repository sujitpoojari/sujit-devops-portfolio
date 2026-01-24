# sujit-devops-portfolio

This repository contains a **Java (Spring Boot) based portfolio application** that presents my professional background, experience, and DevOps expertise in a clean, structured, and web-accessible format.

---

## 🎯 Objective

The objective of this project is to:

- Provide a **self-hostable portfolio application**
- Showcase professional details, experience, and skill sets
- Serve as the **application source** for CI/CD and Kubernetes demonstrations handled in separate repositories

This design follows **enterprise best practices** where application code and platform/infrastructure concerns are maintained independently.

---

## 🧱 Project Scope

### Included
- Java 17
- Spring Boot
- REST endpoints and UI pages
- Application-level configuration
- Health endpoint for observability

### Explicitly Excluded
- Jenkins pipelines
- Kubernetes manifests
- Helm charts
- Infrastructure as Code (IaC)
- Cloud-specific configurations

---

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot**
- **Maven**
- **HTML / Thymeleaf**
- **Git**

---

## 📂 Related Repositories

- **jenkins-ci-cd-pipelines** – CI/CD automation using Jenkins  
- **kubernetes-deployment-manifests** – Kubernetes deployment definitions  

(Links will be added once those repositories are available.)

---

## 🧠 Design Philosophy

- **Separation of concerns** between application and platform
- Clean, minimal, and readable codebase
- Structured for extensibility and automation

# 🚀 DevOps Portfolio – Application Layer

![Kubernetes](https://img.shields.io/badge/Kubernetes-Minicube-blue)
![Docker](https://img.shields.io/badge/Docker-Enabled-blue)
![DevOps](https://img.shields.io/badge/DevOps-End--to--End-green)

This repository also contains the **Application Layer** of an **end-to-end DevOps portfolio project**. It demonstrates how a containerized application is deployed and exposed using **Kubernetes (Minikube)**, following real-world DevOps practices.

---

## 📌 Project Overview

* Application deployed on a local Kubernetes cluster
* Uses Minikube for local Kubernetes setup
* Kubernetes manifests managed via YAML files
* Designed to integrate with CI/CD pipelines (Jenkins / GitLab CI)
* Part of a multi-repository DevOps portfolio

---

## 🏗️ Architecture (High Level)

```text
Developer → Git → CI Pipeline → Docker Image → Kubernetes Deployment → Service → Browser
```

---

## 📂 Repository Structure

```text
.
├── k8s-deployment.yaml   # Kubernetes Deployment manifest
├── k8s-service.yaml      # Kubernetes Service manifest
├── README.md             # Project documentation
```

---

## ✅ Prerequisites

Make sure the following tools are installed and configured:

* Docker
* Minikube
* kubectl
* Git
* Windows PowerShell / Linux / macOS Terminal

---

## ⚙️ Environment Setup

### Start PowerShell (Windows Only)

If required after a system restart:

```text
C:\Windows\System32\WindowsPowerShell\v1.0\powershell.exe
```

---

## 🚀 Deployment Steps

### 1️⃣ Start Minikube

```bash
minikube start
```

Verify cluster status:

```bash
kubectl get nodes
```

---

### 2️⃣ Deploy Application to Kubernetes

Apply Kubernetes manifests:

```bash
kubectl apply -f k8s-deployment.yaml
kubectl apply -f k8s-service.yaml
```

Verify pods:

```bash
kubectl get pods
```

Verify services:

```bash
kubectl get services
```

---

### 3️⃣ Inspect the Service

```bash
kubectl describe svc sujit-portfolio-service
```

---

### 4️⃣ Access the Application

Expose the service via Minikube:

```bash
minikube service sujit-portfolio-service
```

Get Minikube IP (optional):

```bash
minikube ip
```

Access the application using the IP and service port in your browser.

---

## 🔗 CI/CD Integration (Planned / Available)

This application layer is designed to integrate with:

* Jenkins (Build, Test, Dockerize, Deploy)
* GitLab CI
* SonarQube (Code Quality)
* Nexus / Artifact Repository

> CI/CD pipeline configuration is maintained in a separate repository.

---

## 📝 Notes

* Ensure Docker is running before starting Minikube
* This repository focuses **only on the application deployment layer**
* Infrastructure and CI/CD pipelines are managed separately

---

## 👨‍💻 Author

**Sujit Poojari**
DevOps Engineer | 10+ Years of Industry Experience

---

⭐ If you find this repository useful, feel free to star it and explore the full DevOps portfolio!
