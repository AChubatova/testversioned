package Tiger092

import Tiger092.buildTypes.*
import Tiger092.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger092")
    name = "Tiger092"

    vcsRoot(Tiger092_cVCSroot)

    buildType(Tiger092_Hi2)
    buildType(Tiger092_Hi3)
    buildType(Tiger092_Hi0)
    buildType(Tiger092_Hi1)
})
