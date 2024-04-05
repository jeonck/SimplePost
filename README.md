# SimplePost


# push 절차 
cd /path/to/your/spring-boot-project  

git init  
git branch -m main  
git remote add origin https://github.com/yourusername/your-repository-name.git  
git pull origin main  
git add .  
git commit -m "Initial commit"  
git push origin main

# git pull 간단히
git branch --set-upstream-to=origin/main main  

# HelloController 
hello.html 호출   
![image](https://github.com/jeonck/SimplePost/assets/11763994/1fa8b856-c115-4885-aa33-50f5aa9adb17)

# 소스 tree 구조 
```
tree .
.
├── README.md
├── mvnw
├── mvnw.cmd
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── org
│   │   │       └── metacog
│   │   │           └── simplepost
│   │   │               ├── HelloController.java
│   │   │               └── SimplePostApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── templates
│   │           ├── hello.html
│   │           └── index.html
│   └── test
│       └── java
│           └── org
│               └── metacog
│                   └── simplepost
│                       └── SimplePostApplicationTests.java
└── target
    ├── classes
    │   ├── application.properties
    │   ├── org
    │   │   └── metacog
    │   │       └── simplepost
    │   │           ├── HelloController.class
    │   │           └── SimplePostApplication.class
    │   └── templates
    │       ├── hello.html
    │       └── index.html
    ├── generated-sources
    │   └── annotations
    ├── generated-test-sources
    │   └── test-annotations
    └── test-classes
        └── org
            └── metacog
                └── simplepost
                    └── SimplePostApplicationTests.class
```
