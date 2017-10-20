def func1(String para)	{
	currentBuild.result = 'ABORTED'
    error(para)
}

return this