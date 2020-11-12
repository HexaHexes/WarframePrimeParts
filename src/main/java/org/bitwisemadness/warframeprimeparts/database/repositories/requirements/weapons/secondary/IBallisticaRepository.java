package org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.Ballistica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBallisticaRepository extends JpaRepository<Ballistica, String> {
}
