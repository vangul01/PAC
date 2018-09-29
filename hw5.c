x and prints onto screen as hex

void printing_in_hex(int x) {
	int remainder = 0;
	int newNum = 0;

	scanf(x);
	x % 
----------------------------------
	//takes x and prints onto screen as hex
	void getHex (int x) {
	
		scanf("%d\n", x);




		String hexString = "";
		int whileCount = 0;
		int [] remainders[100];

		if (x == 0){
			hexString = "" + 0;
		}

		while (x > 0) {
			whileCount++;
			remainders [whileCount] = (x % 16);
			x = (x / 16);
		}

		for (whileCount = whileCount; whileCount > 0; whileCount--){ 	
			if (remainders[whileCount] < 10){
				hexString = hexString + remainders[whileCount];
			} else {
				hexString = hexString + (char)(remainders[whileCount] + 55); 
			}
		}





		printf(x);

	}


-----------------------------------
	//takes x and prints in binary
	void getBin (int x) {
		
		scanf("%d\n", x);




		String binString = "";
		int whileCount = 0;
		int [] remainders[100];

	//	if (x == 0){
	//		binString = "" + 0;
	//	}


		while (x > 0) { 	
			whileCount++;				
			remainders [whileCount] = (x % 2); 
			x = (x / 2);		
		}
		for (whileCount = whileCount; whileCount > 0; whileCount--){
			binString = binString + remainders[whileCount];
		} 



		printf(x);
	}

-----------------------------------
take x, interpret as IEEE, print as binary
sign, exp, fraction

void fp (int x) {
	int i
	int binArray[32]; //0-31

	scanf("%d\n", x);
	print_in_bin(x);

	if bin is less than 32 characters, padd with zeros in the front
	How???

	read array[0] and set it as sign bit

	for(i=1; i<5; i++) {
		read array[i] and add to a string of exp
	} 

 	for(i=5; i<=31; i++) {
 		read array[i] and add to string of fraction
 	}
}

-------------------------
x prints on screen in reverse bin

void reverse (int x) {
	scanf("%d\n", x);
	
}
-------------------------
takes x, extracts bits  5, 6, 7, 8, print in bin then  in hex

void printSelected (int x) {
	
}