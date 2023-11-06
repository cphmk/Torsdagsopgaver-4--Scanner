// Task 1

// 1.b I have created an entity class called Team.

class classTeam {

// 1.c and 1.d and 1.e

// I have Added private instance variables a.k.a attribute like Team,
// Teams rank and a variable to hold the names of players.

private String teamName;
private int rank;
private String players;

// 1.f
        public Team(String teamName) {


         this.teamName = teamName;

	}

// 1.h
      public void setRank(int rank) {

          this.rank = rank;

    }

    public String toString() {

         return "Team: " + teamName + " rank: " + rank + "players: " + players;
    }
    }





