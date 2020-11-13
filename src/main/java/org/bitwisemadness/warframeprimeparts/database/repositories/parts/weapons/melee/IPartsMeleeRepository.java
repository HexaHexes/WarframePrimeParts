package org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.melee.PartsMelee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPartsMeleeRepository extends JpaRepository<PartsMelee, String> {
    List<PartsMelee> findByName(String name);

    Optional<PartsMelee> findByNameByUser(String name, String appUser);
}
