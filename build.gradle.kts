plugins {
    id("java")
    id("se.thinkcode.cucumber-runner") version "0.0.8"
    id("com.github.spacialcircumstances.gradle-cucumber-reporting") version "0.1.25"
    id("org.springframework.boot") version "2.7.8"
    id("io.spring.dependency-management") version "1.0.15.RELEASE"
}
group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.testng","testng","6.14.3")
    testImplementation ("org.testng","testng","6.14.3")
    testImplementation(platform("org.junit:junit-bom:5.7.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.seleniumhq.selenium","selenium-java","4.0.0")
    implementation("org.seleniumhq.selenium", "selenium-api", "4.0.0")
    implementation("org.seleniumhq.selenium","selenium-remote-driver","4.0.0")
    implementation("org.seleniumhq.selenium","selenium-support","4.0.0")
    implementation("org.seleniumhq.selenium","selenium-ie-driver","4.0.0")
    implementation("io.github.bonigarcia","webdrivermanager","3.8.1")
//    implementation("org.apache.httpcomponents.client5:httpclient5:5.2.1")
    implementation("io.cucumber:cucumber-java:7.1.0")
    testImplementation("io.cucumber:cucumber-junit:6.10.4")
    implementation("io.cucumber","cucumber-testng","6.10.4")
    implementation("io.cucumber", "cucumber-spring","6.10.4")
    implementation("com.aventstack:extentreports:5.0.9")
    implementation("tech.grasshopper:extentreports-cucumber7-adapter:1.10.1")
    implementation("net.masterthought:maven-cucumber-reporting:5.7.8")
    implementation("io.rest-assured:rest-assured:4.3.1")
    implementation("io.rest-assured:json-schema-validator:4.3.1")
    implementation("org.springframework.boot","spring-boot-starter-test","2.7.8")
    testImplementation("org.springframework.boot","spring-boot-starter-test","2.7.8")
    compileOnly("org.projectlombok:lombok:1.18.10") //
    annotationProcessor("org.projectlombok:lombok:1.18.10")
}

tasks.test {
    useJUnitPlatform()
}
tasks.withType<Test> {
    // Menyederhanakan classpath agar lebih kompatibel
    doFirst {
        systemProperty("java.class.path", files(sourceSets.test.get().output,
                configurations.runtimeClasspath.get()).asPath)
    }
}

tasks.register<Jar>("fatJar") {
    manifest {
        attributes["Main-Class"] = "com.swaglags.automation.Cucumber_runner"
    }
    from(sourceSets.main.get().output)
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
}
