package Tiger0615

import Tiger0615.buildTypes.*
import Tiger0615.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0615")
    name = "Tiger0615"

    vcsRoot(Tiger0615_cVCSroot)

    buildType(Tiger0615_Hi3)
    buildType(Tiger0615_Hi2)
    buildType(Tiger0615_Hi1)
    buildType(Tiger0615_Hi0)
})
