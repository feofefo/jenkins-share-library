def call(String name,String weekday) {
    loadLinuxScript(name: 'helloworld.sh')
    sh "./helloworld.sh ${name} ${weekday}"
}