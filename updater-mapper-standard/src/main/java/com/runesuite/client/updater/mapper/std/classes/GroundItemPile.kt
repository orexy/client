package com.runesuite.client.updater.mapper.std.classes

import com.runesuite.mapper.IdentityMapper
import com.runesuite.mapper.OrderMapper
import com.runesuite.mapper.annotations.DependsOn
import com.runesuite.mapper.extensions.and
import com.runesuite.mapper.extensions.predicateOf
import com.runesuite.mapper.extensions.type
import com.runesuite.mapper.tree.Class2
import com.runesuite.mapper.tree.Instruction2
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type.*

@DependsOn(Entity::class)
class GroundItemPile : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == type<Entity>() } == 3 }

    @DependsOn(Scene.newGroundItemPile::class, Entity::class)
    class bottom : OrderMapper.InMethod.Field(Scene.newGroundItemPile::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == type<Entity>() }
    }

    @DependsOn(Scene.newGroundItemPile::class, Entity::class)
    class middle : OrderMapper.InMethod.Field(Scene.newGroundItemPile::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == type<Entity>() }
    }

    @DependsOn(Scene.newGroundItemPile::class, Entity::class)
    class top : OrderMapper.InMethod.Field(Scene.newGroundItemPile::class, 2) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == type<Entity>() }
    }

    @DependsOn(Scene.newGroundItemPile::class)
    class x : OrderMapper.InMethod.Field(Scene.newGroundItemPile::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE && it.fieldOwner == type<GroundItemPile>() }
    }

    @DependsOn(Scene.newGroundItemPile::class)
    class y : OrderMapper.InMethod.Field(Scene.newGroundItemPile::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE && it.fieldOwner == type<GroundItemPile>() }
    }

    @DependsOn(Scene.newGroundItemPile::class)
    class tileHeight : OrderMapper.InMethod.Field(Scene.newGroundItemPile::class, 2) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE && it.fieldOwner == type<GroundItemPile>() }
    }

    @DependsOn(Scene.newGroundItemPile::class)
    class tag : OrderMapper.InMethod.Field(Scene.newGroundItemPile::class, 3) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE && it.fieldOwner == type<GroundItemPile>() }
    }

    @DependsOn(Scene.newGroundItemPile::class)
    class height : OrderMapper.InMethod.Field(Scene.newGroundItemPile::class, 4) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE && it.fieldOwner == type<GroundItemPile>() }
    }
}