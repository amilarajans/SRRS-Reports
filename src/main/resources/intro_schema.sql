SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tsd-srrs`
--

-- --------------------------------------------------------

--
-- Table structure for table `availabilities`
--

CREATE TABLE `availabilities` (
  `id` int(10) UNSIGNED NOT NULL,
  `resource_id` int(10) UNSIGNED NOT NULL,
  `start` datetime NOT NULL,
  `end` datetime NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `description` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `icon` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`id`, `name`, `description`, `created_at`, `updated_at`, `icon`) VALUES
  (1, 'Explicabo', 'Optio provident repudiandae nihil.', '2017-02-01 15:52:05', '2017-02-01 15:52:05', '28e9654c9f32488f960660a06deefad1.jpg'),
  (2, 'Quam', 'Ducimus commodi reiciendis possimus consequatur aut et rerum delectus.', '2017-02-01 15:52:11', '2017-02-01 15:52:11', '19ab078ab682c07533a09b0d587c3fb0.jpg'),
  (3, 'Voluptas', 'Non pariatur officia necessitatibus velit.', '2017-02-01 15:52:12', '2017-02-01 15:52:12', '1aa06ece5dd67fdb51b947274a05a811.jpg'),
  (4, 'Quos', 'Eum fuga nisi numquam aliquam.', '2017-02-01 15:52:13', '2017-02-01 15:52:13', 'dc7c86ce18ccc051e155a5528fc95402.jpg'),
  (5, 'Quam', 'Est necessitatibus tempora exercitationem praesentium.', '2017-02-01 15:52:14', '2017-02-01 15:52:14', '8f46cb105e868e81f2874cfaac5847d1.jpg'),
  (6, 'Veniam', 'Quisquam voluptatem voluptatem fugiat natus non commodi.', '2017-02-01 15:52:15', '2017-02-01 15:52:15', 'c720189d4c7e9368ffa1a65e32aa6c8b.jpg'),
  (7, 'Sint', 'Perspiciatis debitis ut nobis velit et perferendis ab quis.', '2017-02-01 15:52:16', '2017-02-01 15:52:16', 'd46536497c0a791159a783cc7b000b84.jpg'),
  (8, 'Neque', 'Assumenda nesciunt doloremque eius maiores.', '2017-02-01 15:52:16', '2017-02-01 15:52:16', '8e789e3c6cf381b007dbe18280c6d27f.jpg'),
  (9, 'Ut', 'Id laudantium repellat dolores placeat dolore quae sed.', '2017-02-01 15:52:17', '2017-02-01 15:52:17', '79e02de1b61925e483226b5134a85c6d.jpg'),
  (10, 'Ut', 'Sed sit cumque maiores quis aut nemo dolorem.', '2017-02-01 15:52:18', '2017-02-01 15:52:18', '90a4adf841dd764ce4bbf1c9525bbc49.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `migrations`
--

CREATE TABLE `migrations` (
  `migration` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `batch` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `migrations`
--

INSERT INTO `migrations` (`migration`, `batch`) VALUES
  ('2014_10_12_000000_create_users_table', 1),
  ('2014_10_12_100000_create_password_resets_table', 1),
  ('2017_01_08_170455_create_categories_table', 1),
  ('2017_01_11_220327_create_resources_table', 1),
  ('2017_01_27_233059_create_availabilities_table', 1),
  ('2017_01_27_233906_create_reservations_table', 1),
  ('2017_01_30_183355_add_icon_to_categories_table', 1),
  ('2017_02_01_203940_add_reservations_to_reservations_table', 1);

-- --------------------------------------------------------

--
-- Table structure for table `password_resets`
--

CREATE TABLE `password_resets` (
  `email` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `token` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `reservations`
--

CREATE TABLE `reservations` (
  `id` int(10) UNSIGNED NOT NULL,
  `resource_id` int(10) UNSIGNED NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `address` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `nic_number` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `conact_number` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `email_address` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `start` datetime NOT NULL,
  `end` datetime NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `reservations`
--

INSERT INTO `reservations` (`id`, `resource_id`, `name`, `address`, `nic_number`, `conact_number`, `email_address`, `start`, `end`, `created_at`, `updated_at`) VALUES
  (1, 3, 'Dolorum', 'Inventore nihil.', 'dolorem', '163', 'eum', '2017-02-01 21:23:15', '2017-02-01 21:23:15', '2017-02-01 15:53:15', '2017-02-01 15:53:15'),
  (2, 4, 'Molestiae', 'Autem dolor.', 'delectus', '394', 'ea', '2017-02-01 21:23:15', '2017-02-01 21:23:15', '2017-02-01 15:53:15', '2017-02-01 15:53:15'),
  (3, 4, 'Sed', 'Voluptatum consequatur.', 'ut', '824', 'quia', '2017-02-01 21:23:15', '2017-02-01 21:23:15', '2017-02-01 15:53:15', '2017-02-01 15:53:15'),
  (4, 10, 'Mollitia', 'Ducimus amet quam.', 'quasi', '443', 'pariatur', '2017-02-01 21:23:15', '2017-02-01 21:23:15', '2017-02-01 15:53:15', '2017-02-01 15:53:15'),
  (5, 10, 'At', 'Rerum eum.', 'porro', '671', 'beatae', '2017-02-01 21:23:15', '2017-02-01 21:23:15', '2017-02-01 15:53:15', '2017-02-01 15:53:15'),
  (6, 7, 'Voluptas', 'Beatae ab.', 'repellat', '778', 'sed', '2017-02-01 21:23:15', '2017-02-01 21:23:15', '2017-02-01 15:53:15', '2017-02-01 15:53:15'),
  (7, 6, 'Unde', 'Odio quod quam.', 'et', '634', 'porro', '2017-02-01 21:23:15', '2017-02-01 21:23:15', '2017-02-01 15:53:15', '2017-02-01 15:53:15'),
  (8, 8, 'Ratione', 'Voluptatem voluptatum iste.', 'qui', '383', 'hic', '2017-02-01 21:23:15', '2017-02-01 21:23:15', '2017-02-01 15:53:15', '2017-02-01 15:53:15'),
  (9, 2, 'Atque', 'Vero voluptatem autem.', 'blanditiis', '641', 'iure', '2017-02-01 21:23:15', '2017-02-01 21:23:15', '2017-02-01 15:53:15', '2017-02-01 15:53:15'),
  (10, 6, 'Ex', 'Nostrum ea magni.', 'commodi', '451', 'error', '2017-02-01 21:23:15', '2017-02-01 21:23:15', '2017-02-01 15:53:15', '2017-02-01 15:53:15');

-- --------------------------------------------------------

--
-- Table structure for table `resources`
--

CREATE TABLE `resources` (
  `id` int(10) UNSIGNED NOT NULL,
  `category_id` int(10) UNSIGNED NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `location` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `description` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `resources`
--

INSERT INTO `resources` (`id`, `category_id`, `name`, `location`, `description`, `created_at`, `updated_at`) VALUES
  (1, 4, 'Quia', 'Sed quia.', 'Consectetur est consequatur voluptates recusandae debitis eos.', '2017-02-01 15:52:19', '2017-02-01 15:52:19'),
  (2, 4, 'Facere', 'Hic beatae nostrum.', 'Modi dolor iure porro.', '2017-02-01 15:52:19', '2017-02-01 15:52:19'),
  (3, 6, 'Exercitationem', 'Magni repellendus qui.', 'Deserunt velit amet vel.', '2017-02-01 15:52:19', '2017-02-01 15:52:19'),
  (4, 10, 'Repellendus', 'Odit modi natus.', 'Molestiae eos vitae voluptatem harum saepe commodi.', '2017-02-01 15:52:19', '2017-02-01 15:52:19'),
  (5, 9, 'Praesentium', 'Optio tempora.', 'Praesentium a maxime vitae corporis quia sunt.', '2017-02-01 15:52:19', '2017-02-01 15:52:19'),
  (6, 4, 'Rerum', 'Animi porro omnis.', 'Aspernatur ratione a ipsam consequuntur rerum vero voluptas quis.', '2017-02-01 15:52:19', '2017-02-01 15:52:19'),
  (7, 6, 'Animi', 'Error quis sed.', 'Unde aliquid aliquid debitis dolorem assumenda harum minima officiis.', '2017-02-01 15:52:19', '2017-02-01 15:52:19'),
  (8, 10, 'Explicabo', 'Magni aut sit.', 'Debitis eaque quis sit dolores accusamus qui vel.', '2017-02-01 15:52:19', '2017-02-01 15:52:19'),
  (9, 4, 'Voluptas', 'Inventore iusto.', 'Ipsum ab quibusdam asperiores ut dolorem laboriosam eligendi.', '2017-02-01 15:52:19', '2017-02-01 15:52:19'),
  (10, 6, 'Libero', 'Consequatur aut id.', 'Quasi consectetur doloremque cumque ea illo aut dolores.', '2017-02-01 15:52:19', '2017-02-01 15:52:19'),
  (11, 1, 'res11', 'location', 'dkdadkas;d', '2017-02-01 16:29:20', '2017-02-01 16:29:20'),
  (12, 1, 'res11', 'location', 'dkdadkas;d', '2017-02-01 16:29:21', '2017-02-01 16:29:21'),
  (13, 1, 'res11', 'location', 'dkdadkas;d', '2017-02-01 16:29:21', '2017-02-01 16:29:21'),
  (14, 1, 'res11', 'location', 'dkdadkas;d', '2017-02-01 16:29:21', '2017-02-01 16:29:21'),
  (15, 1, 'res11', 'location', 'dkdadkas;d', '2017-02-01 16:29:21', '2017-02-01 16:29:21'),
  (16, 1, 'res11', 'location', 'dkdadkas;d', '2017-02-01 16:29:22', '2017-02-01 16:29:22'),
  (17, 1, 'res11', 'location', 'dkdadkas;d', '2017-02-01 16:29:33', '2017-02-01 16:29:33'),
  (18, 1, 'res11', 'location', 'dkdadkas;d', '2017-02-01 16:29:39', '2017-02-01 16:29:39'),
  (19, 1, 'res11', 'location', 'dkdadkas;d', '2017-02-01 16:30:03', '2017-02-01 16:30:03'),
  (20, 1, 'res11', 'location', 'dkdadkas;d', '2017-02-01 16:30:04', '2017-02-01 16:30:04'),
  (21, 1, 'res11', 'location', 'dkdadkas;d', '2017-02-01 16:30:05', '2017-02-01 16:30:05'),
  (22, 1, 'res11', 'location', 'dkdadkas;d', '2017-02-01 16:30:14', '2017-02-01 16:30:14');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `remember_token` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `name`, `email`, `password`, `remember_token`, `created_at`, `updated_at`) VALUES
  (1, 'Ms. Molly Spencer V', 'admin@srrs.app', '$2y$10$Xf4tDcBiX8RojL1sMUNnre/AhpRRfuOHRuBgf/wOiBWaSqKZzQf9G', NULL, '2017-02-01 15:52:03', '0000-00-00 00:00:00'),
  (2, 'Sienna Gaylord', 'rippin.edythe@king.net', '$2y$10$N0ie/o3nC.o46qLhOFWDxuyFyXWYE7LTUaM2HXQGk1EH./.u66slm', NULL, '2017-02-01 15:52:03', '2017-02-01 15:52:03'),
  (3, 'Dr. Ryder Labadie', 'eschaden@jacobi.com', '$2y$10$YmGFx0epe4w6f/J8pt7nDuHwjf14ZAHko6w.KIPtaH8x7dbBLPQt.', NULL, '2017-02-01 15:52:03', '2017-02-01 15:52:03'),
  (4, 'Vickie Gerhold', 'kayleigh91@treutel.com', '$2y$10$zXV9JKLO9si9Jm2iVs71zOYl73f0Z5y/Sif8xL5PhJ84J1E./8uj2', NULL, '2017-02-01 15:52:03', '2017-02-01 15:52:03'),
  (5, 'Arnoldo Marquardt', 'xemmerich@yahoo.com', '$2y$10$FiqAg8CIytg77//d39Et.epDYZDBzTsVVTpWzKRPJ8JVvNLpQmOH6', NULL, '2017-02-01 15:52:03', '2017-02-01 15:52:03');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `availabilities`
--
ALTER TABLE `availabilities`
  ADD PRIMARY KEY (`id`),
  ADD KEY `availabilities_resource_id_foreign` (`resource_id`);

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `password_resets`
--
ALTER TABLE `password_resets`
  ADD KEY `password_resets_email_index` (`email`),
  ADD KEY `password_resets_token_index` (`token`);

--
-- Indexes for table `reservations`
--
ALTER TABLE `reservations`
  ADD PRIMARY KEY (`id`),
  ADD KEY `reservations_resource_id_foreign` (`resource_id`);

--
-- Indexes for table `resources`
--
ALTER TABLE `resources`
  ADD PRIMARY KEY (`id`),
  ADD KEY `resources_category_id_foreign` (`category_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `user_email_unique` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `availabilities`
--
ALTER TABLE `availabilities`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `categories`
--
ALTER TABLE `categories`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `reservations`
--
ALTER TABLE `reservations`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `resources`
--
ALTER TABLE `resources`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `availabilities`
--
ALTER TABLE `availabilities`
  ADD CONSTRAINT `availabilities_resource_id_foreign` FOREIGN KEY (`resource_id`) REFERENCES `resources` (`id`);

--
-- Constraints for table `reservations`
--
ALTER TABLE `reservations`
  ADD CONSTRAINT `reservations_resource_id_foreign` FOREIGN KEY (`resource_id`) REFERENCES `resources` (`id`);

--
-- Constraints for table `resources`
--
ALTER TABLE `resources`
  ADD CONSTRAINT `resources_category_id_foreign` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
