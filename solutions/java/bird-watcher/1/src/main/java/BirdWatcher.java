
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int count : birdsPerDay) {
            if (count == 0) return true;
        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        if (numberOfDays > 7) numberOfDays = 7;
        
        int sum = 0;
        
        for(int i = 0; i < numberOfDays; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;

        for (int count : birdsPerDay) {
            if (count >= 5) busyDays++;
        }

        return busyDays;
    }
}
