

// --- first method ---

def config = new ConfigSlurper().parse(new File("config.properties").text)

print config

println config['name']

println config.name

println config.job

config['name'] = "jack"

println config.name

println config.aList[1]

println config.aMap['bookname']



