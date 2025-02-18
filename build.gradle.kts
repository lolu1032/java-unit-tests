plugins {
	kotlin("jvm") version "1.8.10" // 원하는 Kotlin 버전
	id("org.springframework.boot") version "3.0.0" // 스프링 부트 버전
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
	kotlin("plugin.spring") version "1.8.10" // Kotlin Spring 플러그인
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	testCompileOnly("org.springframework.boot:spring-boot-starter-test")

	testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
}


tasks.test {
	useJUnitPlatform() // JUnit 5 사용
}
