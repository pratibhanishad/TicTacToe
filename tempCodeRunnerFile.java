          buttons[i2].getText().equals(player) &&
               buttons[i3].getText().equals(player);
    }

    private void checkWinner() {
        String[][] combos = new String[3][3];
        for (int i = 0; i < 9; i++) {
            combos[i / 3][i % 3] = buttons[i].getText();