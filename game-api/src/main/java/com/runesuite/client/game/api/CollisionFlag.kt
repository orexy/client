package com.runesuite.client.game.api

enum class CollisionFlag(val index: Int) {

    WALK_NORTHWEST(1),
    WALK_NORTH(2),
    WALK_NORTHEAST(3),
    WALK_EAST(4),
    WALK_SOUTHEAST(5),
    WALK_SOUTH(6),
    WALK_SOUTHWEST(7),
    WALK_WEST(8),

    ALL(9),

    PROJECTILE_NORTHWEST(10),
    PROJECTILE_NORTH(11),
    PROJECTILE_NORTHEAST(12),
    PROJECTILE_EAST(13),
    PROJECTILE_SOUTHEAST(14),
    PROJECTILE_SOUTH(15),
    PROJECTILE_SOUTHWEST(16),
    PROJECTILE_WEST(17);

    val mask = 1 shl (index - 1)
}

fun main(args: Array<String>) {
    CollisionFlag.values().forEach {
        println("${it.name} ${it.mask.toString(16)}")
    }
}