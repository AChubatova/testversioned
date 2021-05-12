package Tiger0134

import Tiger0134.buildTypes.*
import Tiger0134.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0134")
    name = "Tiger0134"

    vcsRoot(Tiger0134_cVCSroot)

    buildType(Tiger0134_Hi2)
    buildType(Tiger0134_Hi1)
    buildType(Tiger0134_Hi0)
    buildType(Tiger0134_Hi3)
})
