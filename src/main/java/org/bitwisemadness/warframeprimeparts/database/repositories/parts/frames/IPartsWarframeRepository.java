package org.bitwisemadness.warframeprimeparts.database.repositories.parts.frames;

import org.bitwisemadness.warframeprimeparts.database.model.parts.frames.PartsWarframe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPartsWarframeRepository extends JpaRepository<PartsWarframe, String> {
    List<PartsWarframe> findByName(String name);

    Optional<PartsWarframe> findByNameByUser(String name, String appUser);
}
