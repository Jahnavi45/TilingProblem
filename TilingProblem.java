import java.util.Scanner;

public class TilingProblem {

    // Function to calculate number of ways to fill a 2 x n floor
    public static int countWays(int n) {
        // Base cases:
        // If n is 0, there is 1 way (doing nothing)
        // If n is 1, there is 1 way (place a vertical tile)
        if (n == 0 || n == 1) {
            return 1;
        }

        // DP array to store the number of ways to fill 2 x i floor
        int[] dp = new int[n + 1];
        
        // Initialize base cases
        dp[0] = 1; // 1 way to fill 2 x 0 (empty floor)
        dp[1] = 1; // 1 way to fill 2 x 1 (1 vertical tile)
        
        // Build the DP table
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // Ways to fill 2 x i floor
        }

        return dp[n]; // The number of ways to fill 2 x n floor
    }

    // Main function
    public static void main(String[] args) {
        // Taking input from user for floor size (n)
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the floor (n): ");
        int n = scanner.nextInt();  // User enters floor size
        
        // Calculate and print the number of ways to fill the 2 x n floor
        System.out.println("Ways to fill 2 x " + n + " floor: " + countWays(n));
        
        scanner.close();  // Closing scanner
    }
}