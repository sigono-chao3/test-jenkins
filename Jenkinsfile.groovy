#!/usr/bin/env groovy

def scmVars
node() { 
	stage("Checkout"){
		scmVars = checkout changelog: false, poll: false, scm: [$class: 'GitSCM', branches: [[name: 'origin/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/sigono-chao3/test-jenkins']]]
	}
	stage ("First") {
		echo 'First wow'
		sh script: "exit 1"
	}
	stage ("Second") {
		echo 'Second wow'
	}
}