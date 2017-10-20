#!/usr/bin/env groovy

def scmVars
node() { 
	stage ("First") {
		echo 'First wow'
		sh './nope.sh'
	}
	stage ("Second") {
		echo 'Second wow'
	}
}