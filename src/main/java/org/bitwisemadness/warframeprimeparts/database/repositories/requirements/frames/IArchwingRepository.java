package org.bitwisemadness.warframeprimeparts.database.repositories.requirements.frames;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.frames.Archwing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArchwingRepository extends JpaRepository<Archwing, String> {
}
