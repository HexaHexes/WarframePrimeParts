package org.bitwisemadness.warframeprimeparts.database.repositories.requirements.frames;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.frames.Warframe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWarframeRepository extends JpaRepository<Warframe, String> {
}
