package org.bitwisemadness.warframeprimeparts.database.repositories.requirements.frames;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.companions.RequirementsCollar;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.frames.RequirementsWarframe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRequirementsWarframeRepository extends JpaRepository<RequirementsWarframe, String> {
    Optional<RequirementsWarframe> findByName(String name);
}
