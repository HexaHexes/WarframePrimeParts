package org.bitwisemadness.warframeprimeparts.database.repositories.requirements.frames;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.frames.RequirementsWarframe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRequirementsWarframeRepository extends JpaRepository<RequirementsWarframe, String> {
}
