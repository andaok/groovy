try {

    // --- cause an exception code 1 ---
	// def arr = new int[3] 
	// assert arr == [0,0,0]
    // arr[5] = 5

    // --- cause an exception code 2 ---
	File file = new File("/tmp/mynoexist.txt")
	FileReader fr = new FileReader(file)

	
} catch(ArrayIndexOutOfBoundsException ex) {
     
	println(ex.toString())
	//println(ex.getMessage())
	//println(ex.getStackTrace())


} catch(FileNotFoundException ex) {

	println(ex.toString())
	println(ex.getMessage())
	

} catch(Exception ex) {

    println("Catching the Exception")
	
} finally {

	println("The final block")

}

println("Let's move on after the Exception")