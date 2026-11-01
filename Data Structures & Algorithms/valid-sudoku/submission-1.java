public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // for (int row = 0; row < 9; row++) {
        //     Set<Character> seen = new HashSet<>();
        //     for (int i = 0; i < 9; i++) {
        //         if (board[row][i] == '.') continue;
        //         if (seen.contains(board[row][i])) return false;
        //         seen.add(board[row][i]);
        //     }
        // }

        // for (int col = 0; col < 9; col++) {
        //     Set<Character> seen = new HashSet<>();
        //     for (int i = 0; i < 9; i++) {
        //         if (board[i][col] == '.') continue;
        //         if (seen.contains(board[i][col])) return false;
        //         seen.add(board[i][col]);
        //     }
        // }

        // for (int square = 0; square < 9; square++) {
        //     Set<Character> seen = new HashSet<>();
        //     for (int i = 0; i < 3; i++) {
        //         for (int j = 0; j < 3; j++) {
        //             int row = (square / 3) * 3 + i;
        //             int col = (square % 3) * 3 + j;
        //             if (board[row][col] == '.') continue;
        //             if (seen.contains(board[row][col])) return false;
        //             seen.add(board[row][col]);
        //         }
        //     }
        // }

        // return true;

        HashMap<Integer,Set<Character>> rows= new HashMap<>();
        HashMap<Integer,Set<Character>> cols= new HashMap<>();
        HashMap<String,Set<Character>> squares= new HashMap<>();


         for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char num =board[r][c] ;
                if (num == '.') continue;
                    String squareKey =(r/3) +","+(c/3);



                    if(rows.computeIfAbsent(r,k -> new HashSet<>()).contains(num) ||                       cols.computeIfAbsent(c,k -> new HashSet<>()).contains(num) ||                       squares.computeIfAbsent(squareKey,k -> new HashSet<>()).contains(num)){
                        return false;
                    }
                    rows.get(r).add(num);
                    cols.get(c).add(num);
                    squares.get(squareKey).add(num);
            }
         }
         return true;
    }
}