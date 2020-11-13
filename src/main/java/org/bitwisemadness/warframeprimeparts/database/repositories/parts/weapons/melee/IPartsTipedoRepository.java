package org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.melee.PartsTipedo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPartsTipedoRepository extends JpaRepository<PartsTipedo, String> {
    List<PartsTipedo> findByName(String name);

    Optional<PartsTipedo> findByNameByUser(String name, String appUser);
}
