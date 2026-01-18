# sujit-devops-portfolio

This repository contains a **Java (Spring Boot) based portfolio application** that presents my professional background, experience, and DevOps expertise in a clean, structured, and web-accessible format.

This repository is intentionally kept **application-focused only** and does **not** contain CI/CD pipelines, infrastructure code, or Kubernetes manifests.

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

This repository represents the **application layer** in a complete DevOps lifecycle.

Following are commands used to start app on system restart - 
cd C:\Windows\System32\WindowsPowerShell\v1.0\powershell.exe

Make sure minikube is running if not the start minikube with following command -
- minikube start
- kubectl get nodes

- kubectl apply -f k8s-deployment.yaml
- kubectl apply -f k8s-service.yaml
- kubectl get pods
- kubectl get services
- kubectl describe svc sujit-portfolio-service
- minikube service sujit-portfolio-service
- minikube ip
