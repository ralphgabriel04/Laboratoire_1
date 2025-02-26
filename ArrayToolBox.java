public class ArrayToolbox {
  
    /**
     * Sum two arrays containing digits.
     * In the arrays, each element is a single digit.
     * The rightmost digit is the unit one.
     * @param tab1 First array
     * @param tab1 Second array
     * @return The sum of the two numbers
     */
    public static int sum(int[] tab1, int[] tab2) {
      int taille_tab1 = tab1.length;
      int taille_tab2 = tab2.length;
      int maxLength = Math.max(taille_tab1, taille_tab2);
      int sum = 0;
      int carry = 0;
      int power = 1;
  
      // Addition des chiffres de droite à gauche
        for (int i = 0; i < maxLength; i++) {
            int digit1 = (taille_tab1 - 1 - i >= 0) ? tab1[taille_tab1 - 1 - i] : 0;
            int digit2 = (taille_tab2 - 1 - i >= 0) ? tab2[taille_tab2 - 1 - i] : 0;
            int digitSum = digit1 + digit2 + carry;
            carry = digitSum / 10;
            sum += (digitSum % 10) * power;
            power *= 10;
        }
  
      // Ajouter la dernière retenue si elle existe
        if (carry > 0) {
          sum += carry * power;
        }
  
      return sum;
    }
    
    public static void main(String[] args) {
      int[] tab1 = {3, 2, 8};
      int[] tab2 = {4, 7, 1};
      System.out.println(sum(tab1, tab2)); // 799
  
      int[] tab3 = {2, 4};
      int[] tab4 = {5, 2, 9};
      System.out.println(sum(tab3, tab4)); // 553
  
      int[] tab5 = {1, 5, 0};
      int[] tab6 = {3, 4};
      System.out.print(sum(tab5, tab6)); // 184
    }
    
  }
  