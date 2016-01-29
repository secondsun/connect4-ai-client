/*
 * Copyright (C) 2016 summers.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package net.saga.demo.connect.ai.client;

import net.saga.demo.connect.ai.client.game.Game;
import net.saga.demo.connect.ai.client.network.Connection;
import net.saga.demo.connect.ai.client.util.NameGenerator;

/**
 * Main Class
 *
 * @author summers
 */
public class Main {

    public static void main(String[] args) {
        /**
         * Name will be used as the unique identifier of a player.
         */
        final String name = NameGenerator.randomName();
        
        
        Connection connection = Connection.connect(name);
        Game game = connection.startGame();
        /*while (!game.isWon()) {
            Move move = findNextMove();
            List<Update> updates = connection.sendMove(move);
            game.update(updates);
        }
        */
    }

}
