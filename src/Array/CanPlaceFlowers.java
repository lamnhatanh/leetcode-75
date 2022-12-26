public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int placeFlower = 0;
        
        if (flowerbed.length == 1 && flowerbed[0] == 0) {
            return true;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (i == 0) {
                    if (flowerbed[i+1] == 0) {
                        placeFlower++;
                        flowerbed[i] = 1;
                    }
                    
                } else if (i == flowerbed.length - 1) {
                    if (flowerbed[i-1] == 0) {
                        placeFlower++;
                        flowerbed[i] = 1;
                    }
                    
                } else {
                    if (flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                        placeFlower++;
                        flowerbed[i] = 1;
                    }
                }
            }
        }

        return placeFlower >= n;
    }
