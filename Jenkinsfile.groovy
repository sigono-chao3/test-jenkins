#!/usr/bin/env groovy

def scmVars
node() { 
	stage ("First") {
		echo 'First wow'
		sh "$WORKSPACE/nope.sh"
	}
	stage ("Second") {
		echo 'Second wow'
	}
}