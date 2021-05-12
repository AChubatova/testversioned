package Tiger076

import Tiger076.buildTypes.*
import Tiger076.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger076")
    name = "Tiger076"

    vcsRoot(Tiger076_cVCSroot)

    buildType(Tiger076_Hi0)
    buildType(Tiger076_Hi1)
    buildType(Tiger076_Hi2)
    buildType(Tiger076_Hi3)
})
