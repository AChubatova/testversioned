package Tiger086

import Tiger086.buildTypes.*
import Tiger086.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger086")
    name = "Tiger086"

    vcsRoot(Tiger086_cVCSroot)

    buildType(Tiger086_Hi0)
    buildType(Tiger086_Hi2)
    buildType(Tiger086_Hi1)
    buildType(Tiger086_Hi3)
})
