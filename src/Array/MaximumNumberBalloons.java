public int maxNumberOfBalloons(String text) {
        int bCount = 0;
        int aCount = 0;
        int lCount = 0;
        int oCount = 0;
        int nCount = 0;

        for (char c : text.toCharArray()) {
            switch (c) {
                case 'b': 
                    bCount++;
                    break;
                case 'a': 
                    aCount++;
                    break;
                case 'l': 
                    lCount++;
                    break;
                case 'o':
                    oCount++;
                    break;
                case 'n': 
                    nCount++;
                    break;
            }            
        }
        
        lCount = lCount / 2;
        oCount = oCount / 2;

        int maxBalloon = Math.min(bCount, Math.min(aCount, Math.min(lCount, Math.min(oCount, nCount))));
        return maxBalloon;
    }
