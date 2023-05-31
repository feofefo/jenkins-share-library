def call(String name) {
    def script = libraryResource "${name}"
    writeFile file: "${name}", text: script
    sh "chmod +x ${name}"
}