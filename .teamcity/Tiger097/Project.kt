package Tiger097

import Tiger097.buildTypes.*
import Tiger097.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger097")
    name = "Tiger097"

    vcsRoot(Tiger097_cVCSroot)

    buildType(Tiger097_Hi0)
    buildType(Tiger097_Hi1)
    buildType(Tiger097_Hi2)
    buildType(Tiger097_Hi3)
})
