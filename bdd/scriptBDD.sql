CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    mdp TEXT NOT NULL
);

CREATE TABLE categories (
    id SERIAL PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    description TEXT
);

CREATE TABLE sous_categories (
    id SERIAL PRIMARY KEY,
    id_categorie INT NOT NULL REFERENCES categories(id) ON DELETE CASCADE,
    nom VARCHAR(255) NOT NULL,
    description TEXT
);

CREATE TABLE provenances (
    id SERIAL PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    description TEXT
);

CREATE TABLE users_categories (
    id_user INT NOT NULL REFERENCES users(id) ON DELETE CASCADE,
    id_categorie INT NOT NULL REFERENCES categories(id) ON DELETE CASCADE,
    PRIMARY KEY (id_user, id_categorie)
);

CREATE TABLE users_sous_categories (
    id_user INT NOT NULL REFERENCES users(id) ON DELETE CASCADE,
    id_sous_categorie INT NOT NULL REFERENCES sous_categories(id) ON DELETE CASCADE,
    PRIMARY KEY (id_user, id_sous_categorie)
);

CREATE TABLE users_provenances (
    id_user INT NOT NULL REFERENCES users(id) ON DELETE CASCADE,
    id_provenance INT NOT NULL REFERENCES provenances(id) ON DELETE CASCADE,
    PRIMARY KEY (id_user, id_provenance)
);

CREATE TABLE transactions (
    id SERIAL PRIMARY KEY,
    id_user INT NOT NULL REFERENCES users(id) ON DELETE CASCADE,
    montant DECIMAL(10,2) NOT NULL,
    type VARCHAR(10) CHECK (type IN ('depense', 'revenu')) NOT NULL,
    date DATE NOT NULL,
    id_categorie INT NOT NULL REFERENCES categories(id) ON DELETE CASCADE,
    id_sous_categorie INT NOT NULL REFERENCES sous_categories(id) ON DELETE CASCADE,
    id_provenance INT NOT NULL REFERENCES provenances(id) ON DELETE CASCADE,
    description TEXT
);
