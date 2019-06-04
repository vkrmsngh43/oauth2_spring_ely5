/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java project to get you started.
 * For more details take a look at the Java Quickstart chapter in the Gradle
 * User Manual available at https://docs.gradle.org/5.4.1/userguide/tutorial_java_projects.html
 */


import org.springframework.boot.gradle.tasks.run.BootRun

val mapstructVersion = "1.3.0.Final"
val lombokVersion = "1.18.4"
val springBootVersion = "2.1.4.RELEASE"
val powermockVersion = "2.0.0-RC.1"
val log4j2Version = "2.8.2"
val junitPlatformVersion = "1.4.2"
val mockitoJunitJupiterVersion = "2.23.0"
val junitJupiterVersion = "5.4.2"
val junitVintageVersion = "5.4.2"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
//    sourceSets {
//        main {
//            resources { exclude("**/*.jks") }
//        }
//    }
}
//gcr.io/distroless/java:11
    jib.to.image = "localhost:5000/simplicity-springdemo"
    jib.from.image = "gcr.io/distroless/java:11"
    repositories {
        mavenCentral()
        jcenter()
        gradlePluginPortal()
        maven(url = "https://repo.spring.io/snapshot")
        maven(url = "https://repo.spring.io/milestone")
//    maven(url = "https://jitpack.io")
//    maven(url = "https://oss.jfrog.org/artifactory/oss-release-local/")
    }

    plugins {
        // Apply the java plugin to add support for Java
        `java-library`

        // Apply the application plugin to add support for building an application
        application
        id("idea")
        id("eclipse")
        id("com.gradle.build-scan") version "2.0.2"
        id("org.springframework.boot") version "2.1.4.RELEASE"
        id("io.spring.dependency-management") version "1.0.7.RELEASE"
        id("net.ltgt.apt") version "0.21"
        id("com.google.cloud.tools.jib") version "1.1.2"
        id("io.freefair.lombok") version "3.2.1"
    }

    buildscript {
        val springBootVersion = "2.1.4.RELEASE"
        val hibernateVersion = "5.4.2.Final"

        dependencies {
            classpath("gradle.plugin.com.boxfuse.client:gradle-plugin-publishing:5.0.3")
            classpath("org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion")
            classpath("org.hibernate:hibernate-gradle-plugin:$hibernateVersion")
        }
    }

    dependencies {
        // This dependency is found on compile classpath of this component and consumers.
        api("org.springframework.boot:spring-boot-starter-aop:$springBootVersion")
        api("org.springframework.boot:spring-boot-starter-data-jpa:$springBootVersion")
        api("org.springframework.boot:spring-boot-starter-jdbc:$springBootVersion")
        api("org.springframework.boot:spring-boot-starter-security:$springBootVersion")
        api("org.springframework.boot:spring-boot-starter-validation:$springBootVersion")
        api("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
        api("org.springframework.security.oauth.boot:spring-security-oauth2-autoconfigure:2.1.2.RELEASE")
        //This dep treats nested classes as if they were nested properties
        api("org.springframework.boot:spring-boot-configuration-processor:$springBootVersion")
//    compile('org.springframework.boot:spring-boot-starter-oauth2-oidc-client:2.1.0.BUILD-SNAPSHOT')
        implementation("io.springfox:springfox-swagger2:2.9.2")
        implementation("io.springfox:springfox-swagger-ui:2.9.2")
        api("io.rest-assured:rest-assured:3.0.0")
        api("io.rest-assured:spring-mock-mvc:3.0.0")
//    compile('org.springframework.security.oauth:spring-security-oauth2:2.3.3.RELEASE')
//    compile('org.projectlombok:lombok')
        annotationProcessor("org.projectlombok:lombok:$lombokVersion")
        api("org.projectlombok:lombok:$lombokVersion")
        implementation("org.mapstruct:mapstruct:$mapstructVersion")
        annotationProcessor("org.mapstruct:mapstruct-processor:$mapstructVersion")
        testAnnotationProcessor("org.mapstruct:mapstruct-processor:$mapstructVersion")
        api("org.springframework.boot:spring-boot-devtools:$springBootVersion")
        api("org.apache.commons:commons-lang3:3.8.1")
        api("javax.xml.bind:jaxb-api:2.3.0")
        api("javax.activation:activation:1.1")
        api("org.glassfish.jaxb:jaxb-runtime:2.3.0")
        api("javax.annotation:javax.annotation-api:1.3.2")
        runtime("mysql:mysql-connector-java")
        runtime("org.mariadb.jdbc:mariadb-java-client:2.4.1")
        testRuntime("com.h2database:h2")
//    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.4.2")
//    testImplementation("org.junit.jupiter:junit-jupiter-api:5.4.2")
        testImplementation("org.apache.logging.log4j:log4j-core:$log4j2Version")
        testImplementation("org.springframework.security:spring-security-test")
        testImplementation("org.springframework.boot:spring-boot-starter-test:$springBootVersion")
        testImplementation("org.powermock:powermock-module-junit4:$powermockVersion")
        testImplementation("org.mockito:mockito-junit-jupiter:$mockitoJunitJupiterVersion")
        testImplementation("org.powermock:powermock-api-mockito2:$powermockVersion")

        // Use JUnit test framework
    }

    application {
        // Define the main class for the application
        mainClassName = "com.example.springdemo.SpringdemoApplication"
    }


    tasks {
        "bootRun"(BootRun::class) {
            main = "com.simplicity.authserver.SpringdemoApplication"
//        args("--spring.profiles.active=demo")
        }
    }

