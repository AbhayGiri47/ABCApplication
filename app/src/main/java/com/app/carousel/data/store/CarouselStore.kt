package com.app.carousel.data.store

import com.app.carousel.R
import com.app.carousel.data.model.Carousel
import com.app.carousel.data.model.CarouselList
import com.app.carousel.data.model.CarouselType

class CarouselStore {

    val houseSubItems = listOf(
        CarouselList(
            R.drawable.thumbnail_house,
            "Bungalow",
            "A single-story house with a wide layout."
        ),
        CarouselList(
            R.drawable.thumbnail_house,
            "Villa",
            "A luxurious and spacious standalone house."
        ),
        CarouselList(
            R.drawable.thumbnail_house,
            "Apartment",
            "A residential unit in a multi-story building."
        ),
        CarouselList(
            R.drawable.thumbnail_house,
            "Cottage",
            "A small, cozy house, often in a rural setting."
        ),
        CarouselList(
            R.drawable.thumbnail_house,
            "Townhouse",
            "A multi-story house sharing walls with adjacent homes."
        ),
        CarouselList(R.drawable.thumbnail_house, "Mansion", "A large, grand, and opulent house."),
        CarouselList(
            R.drawable.thumbnail_house,
            "Duplex",
            "A house divided into two separate units."
        ),
        CarouselList(
            R.drawable.thumbnail_house,
            "Farmhouse",
            "A house on a farm, typically surrounded by land."
        ),
        CarouselList(
            R.drawable.thumbnail_house,
            "Studio Apartment",
            "A small, self-contained living space."
        ),
        CarouselList(R.drawable.thumbnail_house, "Penthouse", "A luxurious top-floor apartment."),
        CarouselList(
            R.drawable.thumbnail_house,
            "Cabin",
            "A simple house, usually made of wood, in a remote area."
        ),
        CarouselList(
            R.drawable.thumbnail_house,
            "Loft",
            "A large, open living space often converted from an industrial area."
        ),
        CarouselList(
            R.drawable.thumbnail_house,
            "Row House",
            "A series of similar houses in a continuous row."
        ),
        CarouselList(R.drawable.thumbnail_house, "Treehouse", "A house built in or around a tree."),
        CarouselList(
            R.drawable.thumbnail_house,
            "Mobile Home",
            "A portable house that can be moved to different locations."
        ),
        CarouselList(R.drawable.thumbnail_house, "Tiny House", "A compact and minimalist home."),
        CarouselList(
            R.drawable.thumbnail_house,
            "Beach House",
            "A house located near a beach or coastline."
        ),
        CarouselList(
            R.drawable.thumbnail_house,
            "Eco-friendly House",
            "A house built with sustainable and green materials."
        ),
        CarouselList(
            R.drawable.thumbnail_house,
            "Skyscraper Apartment",
            "A residential unit in a high-rise building."
        )
    )

    val birdSubItems = listOf(
        CarouselList(
            R.drawable.thumbnail_birds,
            "Eagle",
            "A powerful bird of prey with keen eyesight."
        ),
        CarouselList(
            R.drawable.thumbnail_birds,
            "Parrot",
            "A colorful bird known for mimicking sounds."
        ),
        CarouselList(
            R.drawable.thumbnail_birds,
            "Sparrow",
            "A small and agile bird commonly found worldwide."
        ),
        CarouselList(
            R.drawable.thumbnail_birds,
            "Owl",
            "A nocturnal bird of prey with large eyes."
        ),
        CarouselList(
            R.drawable.thumbnail_birds,
            "Peacock",
            "A bird known for its vibrant tail feathers."
        ),
        CarouselList(
            R.drawable.thumbnail_birds,
            "Penguin",
            "A flightless bird adapted to aquatic life."
        ),
        CarouselList(
            R.drawable.thumbnail_birds,
            "Hummingbird",
            "A tiny bird known for its rapid wing movement."
        ),
        CarouselList(
            R.drawable.thumbnail_birds,
            "Flamingo",
            "A tall bird with pink plumage and long legs."
        ),
        CarouselList(
            R.drawable.thumbnail_birds,
            "Kingfisher",
            "A bird known for its striking colors and fishing skills."
        ),
        CarouselList(
            R.drawable.thumbnail_birds,
            "Crow",
            "A highly intelligent and adaptable bird."
        ),
        CarouselList(
            R.drawable.thumbnail_birds,
            "Swan",
            "A graceful water bird with white feathers."
        ),
        CarouselList(
            R.drawable.thumbnail_birds,
            "Woodpecker",
            "A bird known for pecking at wood to find insects."
        ),
        CarouselList(
            R.drawable.thumbnail_birds,
            "Canary",
            "A small bird known for its melodious singing."
        ),
        CarouselList(
            R.drawable.thumbnail_birds,
            "Pigeon",
            "A common city bird known for its adaptability."
        ),
        CarouselList(
            R.drawable.thumbnail_birds,
            "Hawk",
            "A bird of prey known for its speed and hunting skills."
        ),
        CarouselList(
            R.drawable.thumbnail_birds,
            "Robin",
            "A small bird with a distinctive red breast."
        ),
        CarouselList(
            R.drawable.thumbnail_birds,
            "Duck",
            "A waterfowl known for its webbed feet and quacking sound."
        ),
        CarouselList(R.drawable.thumbnail_birds, "Toucan", "A bird with a large, colorful beak."),
        CarouselList(
            R.drawable.thumbnail_birds,
            "Seagull",
            "A coastal bird often seen near oceans and lakes."
        )
    )

    val vehicleSubItems = listOf(
        CarouselList(
            R.drawable.thumbnail_vehicle,
            "Car",
            "A four-wheeled motor vehicle for transportation."
        ),
        CarouselList(
            R.drawable.thumbnail_vehicle,
            "Motorcycle",
            "A two-wheeled motorized vehicle."
        ),
        CarouselList(
            R.drawable.thumbnail_vehicle,
            "Bicycle",
            "A two-wheeled pedal-powered vehicle."
        ),
        CarouselList(
            R.drawable.thumbnail_vehicle,
            "Truck",
            "A large motor vehicle for transporting goods."
        ),
        CarouselList(
            R.drawable.thumbnail_vehicle,
            "Bus",
            "A large vehicle for public or private passenger transport."
        ),
        CarouselList(
            R.drawable.thumbnail_vehicle,
            "Van",
            "A medium-sized motor vehicle for transporting goods or people."
        ),
        CarouselList(
            R.drawable.thumbnail_vehicle,
            "Train",
            "A vehicle that runs on tracks for mass transport."
        ),
        CarouselList(
            R.drawable.thumbnail_vehicle,
            "Airplane",
            "An aircraft designed for air travel."
        ),
        CarouselList(
            R.drawable.thumbnail_vehicle,
            "Helicopter",
            "A rotary-winged aircraft for versatile transport."
        ),
        CarouselList(
            R.drawable.thumbnail_vehicle,
            "Boat",
            "A watercraft designed for travel on water."
        ),
        CarouselList(
            R.drawable.thumbnail_vehicle,
            "Ship",
            "A large vessel for transporting goods or people across water."
        ),
        CarouselList(
            R.drawable.thumbnail_vehicle,
            "Submarine",
            "An underwater vehicle for exploration or military use."
        ),
        CarouselList(
            R.drawable.thumbnail_vehicle,
            "Scooter",
            "A lightweight motorized two-wheeled vehicle."
        ),
        CarouselList(
            R.drawable.thumbnail_vehicle,
            "Tram",
            "A rail vehicle used for urban public transport."
        ),
        CarouselList(
            R.drawable.thumbnail_vehicle,
            "RV",
            "A recreational vehicle for traveling and living."
        ),
        CarouselList(
            R.drawable.thumbnail_vehicle,
            "SUV",
            "A sport utility vehicle designed for on-road and off-road use."
        ),
        CarouselList(R.drawable.thumbnail_vehicle, "Convertible", "A car with a retractable roof."),
        CarouselList(R.drawable.thumbnail_vehicle, "Electric Car", "A car powered by electricity."),
        CarouselList(
            R.drawable.thumbnail_vehicle,
            "Hovercraft",
            "A vehicle that glides over surfaces on a cushion of air."
        ),
        CarouselList(
            R.drawable.thumbnail_vehicle,
            "Jet Ski",
            "A small watercraft for recreational use."
        ),
        CarouselList(
            R.drawable.thumbnail_vehicle,
            "Bulldozer",
            "A powerful vehicle for construction work."
        ),
        CarouselList(
            R.drawable.thumbnail_vehicle,
            "Tractor",
            "A vehicle used in agriculture for pulling equipment."
        ),
    )

    val clothingItems = listOf(
        CarouselList(R.drawable.thumbnail_clothing, "T-Shirts", "Casual and versatile upper wear."),
        CarouselList(R.drawable.thumbnail_clothing, "Jeans", "Durable and comfortable denim pants."),
        CarouselList(
            R.drawable.thumbnail_clothing,
            "Jackets",
            "Outerwear for warmth and style."
        ),
        CarouselList(R.drawable.thumbnail_clothing, "Shirts", "Formal or casual upper wear."),
        CarouselList(
            R.drawable.thumbnail_clothing,
            "Dresses",
            "One-piece outfits for various occasions."
        ),
        CarouselList(
            R.drawable.thumbnail_clothing,
            "Skirts",
            "Versatile bottom wear for women."
        ),
        CarouselList(R.drawable.thumbnail_clothing, "Shorts", "Comfortable and casual bottom wear."),
        CarouselList(
            R.drawable.thumbnail_clothing,
            "Sweaters",
            "Knitted upper wear for colder weather."
        ),
        CarouselList(
            R.drawable.thumbnail_clothing,
            "Hoodies",
            "Casual and cozy sweatshirts with hoods."
        ),
        CarouselList(
            R.drawable.thumbnail_clothing,
            "Blazers",
            "Formal jackets for business or events."
        ),
        CarouselList(R.drawable.thumbnail_clothing, "Coats", "Long outerwear for warmth."),
        CarouselList(
            R.drawable.thumbnail_clothing,
            "Trousers",
            "Formal or casual pants for everyday wear."
        ),
        CarouselList(
            R.drawable.thumbnail_clothing,
            "Suits",
            "Matching formal jackets and trousers."
        ),
        CarouselList(
            R.drawable.thumbnail_clothing,
            "Pajamas",
            "Comfortable sleepwear for relaxation."
        ),
        CarouselList(
            R.drawable.thumbnail_clothing,
            "Activewear",
            "Clothing for workouts and sports."
        ),
        CarouselList(
            R.drawable.thumbnail_clothing,
            "Swimwear",
            "Clothing designed for swimming activities."
        ),
        CarouselList(
            R.drawable.thumbnail_clothing,
            "Scarves",
            "Accessories for warmth or fashion."
        ),
        CarouselList(
            R.drawable.thumbnail_clothing,
            "Hats",
            "Headwear for style or sun protection."
        ),
        CarouselList(
            R.drawable.thumbnail_clothing,
            "Gloves",
            "Handwear for warmth or protection."
        )
    )

    val treeSubItems = listOf(
        CarouselList(R.drawable.thumbnail_trees, "Oak", "A large, strong tree with lobed leaves."),
        CarouselList(R.drawable.thumbnail_trees, "Pine", "An evergreen tree with needle-like leaves."),
        CarouselList(R.drawable.thumbnail_trees, "Maple", "Known for its distinctive leaves and syrup."),
        CarouselList(R.drawable.thumbnail_trees, "Birch", "A tree with white bark and delicate leaves."),
        CarouselList(R.drawable.thumbnail_trees, "Willow", "A tree with long, drooping branches."),
        CarouselList(R.drawable.thumbnail_trees, "Cherry Blossom", "A tree famous for its pink and white blossoms."),
        CarouselList(R.drawable.thumbnail_trees, "Redwood", "One of the tallest trees in the world."),
        CarouselList(R.drawable.thumbnail_trees, "Cedar", "A coniferous tree with aromatic wood."),
        CarouselList(R.drawable.thumbnail_trees, "Baobab", "A tree with a thick trunk, native to Africa."),
        CarouselList(R.drawable.thumbnail_trees, "Palm", "A tropical tree with long, feathery leaves."),
        CarouselList(R.drawable.thumbnail_trees, "Aspen", "A tree with trembling leaves that shimmer in the wind."),
        CarouselList(R.drawable.thumbnail_trees, "Cypress", "A conical tree often associated with Mediterranean regions."),
        CarouselList(R.drawable.thumbnail_trees, "Eucalyptus", "A fast-growing tree with aromatic leaves."),
        CarouselList(R.drawable.thumbnail_trees, "Banyan", "A large tree with aerial roots."),
        CarouselList(R.drawable.thumbnail_trees, "Magnolia", "A tree with large, fragrant flowers."),
        CarouselList(R.drawable.thumbnail_trees, "Spruce", "A coniferous tree with a pyramid shape."),
        CarouselList(R.drawable.thumbnail_trees, "Fir", "An evergreen tree with flat needle-like leaves."),
        CarouselList(R.drawable.thumbnail_trees, "Sequoia", "A massive tree native to California."),
        CarouselList(R.drawable.thumbnail_trees, "Dogwood", "A tree with attractive flowers and colorful foliage.")
    )

    val carouselList = listOf(
        Carousel(R.drawable.house, CarouselType.HOUSE),
        Carousel(R.drawable.birds, CarouselType.BIRDS),
        Carousel(R.drawable.vehicle, CarouselType.VEHICLE),
        Carousel(R.drawable.clothes, CarouselType.CLOTHES),
        Carousel(R.drawable.trees, CarouselType.TREES)
    )


}