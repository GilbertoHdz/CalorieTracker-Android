import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
  `kotlin-dsl` // Will convert this folder on a AndroidModule for gradle setup
}

repositories {
  google()
  mavenCentral()
  maven(url = "https://jitpack.io")
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.20")
  implementation("com.android.tools.build:gradle:8.0.2")

  // https://github.com/google/dagger/issues/3068#issuecomment-999118496
  // Required to fix a missing dependency error
  implementation("com.squareup:javapoet:1.13.0")
}

val compileKotlin: org.jetbrains.kotlin.gradle.tasks.KotlinCompile by tasks
compileKotlin.kotlinOptions {
  jvmTarget = "18" // Update to gradle 18 from Setting AndroidStudio GradleJDK
}