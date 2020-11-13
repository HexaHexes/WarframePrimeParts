package org.bitwisemadness.warframeprimeparts.database.repositories.requirements.frames;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.companions.RequirementsCollar;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.frames.RequirementsArchwing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRequirementsArchwingRepository extends JpaRepository<RequirementsArchwing, String> {
    Optional<RequirementsArchwing> findByName(String name);
}
