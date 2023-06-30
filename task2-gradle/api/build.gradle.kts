plugins {
    id("java")
}

group = rootProject.group
version = rootProject.version

dependencies {
    implementation(project(":db"))
    implementation(project(":service"))
}
