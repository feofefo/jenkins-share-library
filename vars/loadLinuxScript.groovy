def call(Map config = [:]) {
    def script = libraryResource "${config.name}"
    writeFile file: "${config.name}", text: script
    sh "chmod +x ${config.name}"
}