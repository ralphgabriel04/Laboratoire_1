public class Statistics {
  
    public static int elemCount(float[] tab) {
      return tab.length;
    }
    
     public static float average(float[] tab) {
        if (tab.length == 0) return Float.NaN; // Évite la division par zéro
  
        float sum = 0;
        for (float num : tab) {
            sum += num;
        }
        return sum / tab.length;
    }
    
    /**
     * Retourne la plus grande valeur du tableau.
     * Si le tableau est vide, retourne Float.NaN.
     */
    public static float max(float[] tab) {
        if (tab.length == 0) return Float.NaN;
  
        float maxValue = tab[0];
        for (float num : tab) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }
  
    /**
     * Retourne la plus petite valeur du tableau.
     * Si le tableau est vide, retourne Float.NaN.
     */
    public static float min(float[] tab) {
        if (tab.length == 0) return Float.NaN;
  
        float minValue = tab[0];
        for (float num : tab) {
            if (num < minValue) {
                minValue = num;
            }
        }
        return minValue;
    }
    public static void main(String[] args) {
         // Vérification qu'il y a au moins un argument
          if (args.length < 2) {
              System.out.println("Invalid operation");
              return;
          }
  
          // Lecture du premier argument comme un entier
          int operation;
          try {
              operation = Integer.parseInt(args[0]);
          } catch (NumberFormatException e) {
              System.out.println("Invalid operation " + args[0]);
              return;
          }
  
          // Lecture des autres arguments comme des nombres flottants
          float[] values = new float[args.length - 1];
          try {
              for (int i = 1; i < args.length; i++) {
                  values[i - 1] = Float.parseFloat(args[i]);
              }
          } catch (NumberFormatException e) {
              System.out.println("Invalid input");
              return;
          }
  
          // Exécuter l'opération en fonction du premier argument
          switch (operation) {
              case 1:
                  System.out.println(elemCount(values));
                  break;
              case 2:
                  System.out.println(average(values));
                  break;
              case 3:
                  System.out.println(max(values) + ", " + min(values));
                  break;
              default:
                  System.out.println("Invalid operation " + operation);
          }
      }
    }
  